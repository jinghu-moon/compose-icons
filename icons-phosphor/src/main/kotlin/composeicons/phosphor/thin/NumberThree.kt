package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorThinIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 160c.002 20.508-12.05 39.101-30.771 47.474-18.721 8.372-40.614 4.959-55.899-8.714-1.657-1.475-1.805-4.013-.33-5.67 1.475-1.657 4.013-1.805 5.67-.33 14.611 13.1 36.13 14.941 52.754 4.514 16.624-10.428 24.333-30.603 18.898-49.459C156.888 128.959 139.624 115.981 120 116c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189L160 52h-72c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c1.515 0 2.9 .856 3.578 2.211 .678 1.355 .531 2.977-.378 4.189l-43.61 58.15c25.496 3.796 44.379 25.673 44.41 51.45Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
