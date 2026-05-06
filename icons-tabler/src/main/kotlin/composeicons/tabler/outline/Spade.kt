package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = tablerOutlineIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3l4.919 4.5c.61 .587 1.177 1.177 1.703 1.771 1.733 1.969 1.843 4.885 .264 6.979C17.706 17.81 15.548 18.17 14 17v1l1 3h-6l1-3v-1c-1.54 1.07-3.735 .772-4.886-.75C3.535 14.156 3.645 11.24 5.378 9.271 5.922 8.658 6.49 8.068 7.081 7.5 8.717 5.996 10.357 4.496 12 3"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
