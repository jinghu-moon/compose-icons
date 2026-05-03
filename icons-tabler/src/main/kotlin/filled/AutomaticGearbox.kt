package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AutomaticGearbox: ImageVector
    get() {
        if (_automaticGearbox != null) return _automaticGearbox!!
        _automaticGearbox = tablerFilledIcon(
            name = "AutomaticGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 16.000 C 19.657 16.000 21.000 17.343 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 17.000 22.000 C 16.448 22.000 16.000 21.552 16.000 21.000 L 16.000 17.000 C 16.000 16.448 16.448 16.000 17.000 16.000 ZM 18.000 20.000 L 18.117 19.993 C 18.642 19.931 19.028 19.470 18.997 18.941 C 18.966 18.413 18.529 18.001 18.000 18.000 ZM 18.500 7.000 C 19.881 7.000 21.000 8.119 21.000 9.500 C 21.000 10.881 19.881 12.000 18.500 12.000 L 18.000 12.000 L 18.000 13.000 C 18.000 13.507 17.620 13.934 17.117 13.993 L 17.000 14.000 C 16.448 14.000 16.000 13.552 16.000 13.000 L 16.000 8.000 C 16.000 7.448 16.448 7.000 17.000 7.000 ZM 18.000 10.000 L 18.500 10.000 C 18.776 10.000 19.000 9.776 19.000 9.500 C 19.000 9.224 18.776 9.000 18.500 9.000 L 18.000 9.000 ZM 13.000 10.000 C 13.552 10.000 14.000 10.448 14.000 11.000 C 14.000 11.552 13.552 12.000 13.000 12.000 L 10.000 12.000 L 10.000 18.000 L 13.000 18.000 C 13.552 18.000 14.000 18.448 14.000 19.000 C 14.000 19.552 13.552 20.000 13.000 20.000 L 10.000 20.000 C 8.895 20.000 8.000 19.105 8.000 18.000 L 8.000 12.000 L 6.000 12.000 C 4.953 12.000 4.083 11.194 4.005 10.150 L 4.000 10.000 L 4.000 7.830 C 2.801 7.406 1.999 6.272 2.000 5.000 L 2.005 4.824 C 2.094 3.324 3.279 2.120 4.778 2.009 C 6.277 1.898 7.626 2.913 7.936 4.384 C 8.245 5.855 7.418 7.327 6.001 7.829 L 6.000 10.000 Z"),
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
        return _automaticGearbox!!
    }

private var _automaticGearbox: ImageVector? = null
