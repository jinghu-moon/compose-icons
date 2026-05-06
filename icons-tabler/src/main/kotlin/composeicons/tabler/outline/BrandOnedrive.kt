package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOnedrive: ImageVector
    get() {
        if (_brandOnedrive != null) return _brandOnedrive!!
        _brandOnedrive = tablerOutlineIcon(
            name = "BrandOnedrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.456 10.45C18.03 7.734 15.928 5.586 13.222 5.101 10.516 4.616 7.799 5.9 6.456 8.299 5.172 8.405 3.983 9.017 3.151 10c-.833 .983-1.241 2.256-1.135 3.54 .105 1.284 .716 2.473 1.698 3.306 .982 .833 2.255 1.243 3.538 1.138h10.751c.999 .06 1.98-.28 2.728-.943 .748-.664 1.202-1.598 1.262-2.597 .125-2.079-1.459-3.867-3.538-3.992l.001-.002"),
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
        return _brandOnedrive!!
    }

private var _brandOnedrive: ImageVector? = null
