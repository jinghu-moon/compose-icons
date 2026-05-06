package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MedicalCross: ImageVector
    get() {
        if (_medicalCross != null) return _medicalCross!!
        _medicalCross = tablerOutlineIcon(
            name = "MedicalCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 3c.552 0 1 .448 1 1v4.535L17.928 6.268c.478-.276 1.09-.112 1.366 .366l1 1.732c.276 .478 .112 1.09-.366 1.366L16.001 12l3.927 2.269c.478 .276 .642 .888 .366 1.366l-1 1.732c-.276 .478-.888 .642-1.366 .366L14 15.464v4.536c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-4.536L6.072 17.732c-.478 .276-1.09 .112-1.366-.366L3.706 15.634c-.276-.478-.112-1.09 .366-1.366L7.999 12 4.072 9.732C3.594 9.456 3.43 8.844 3.706 8.366L4.706 6.634c.276-.478 .888-.642 1.366-.366L10 8.535v-4.535c0-.552 .448-1 1-1h2"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _medicalCross!!
    }

private var _medicalCross: ImageVector? = null
