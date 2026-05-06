package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorDuotoneIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M92 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM164 116c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM151.73 161.23c-14.534 9.02-32.926 9.02-47.46 0-3.739-2.358-8.682-1.239-11.04 2.5-2.358 3.739-1.239 8.682 2.5 11.04 19.752 12.313 44.788 12.313 64.54 0 3.739-2.358 4.858-7.301 2.5-11.04-2.358-3.739-7.301-4.858-11.04-2.5ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM216 128C215.942 80.943 178.918 42.237 131.91 40.09 120.32 56.38 120 71.88 120 72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 13.255-10.745 24-24 24C114.745 96 104 85.255 104 72c0-.73 .13-14.3 8.46-30.63C66.614 49.595 35.118 92.121 40.615 138.373c5.497 46.253 46.084 80.21 92.581 77.46C179.692 213.083 215.993 174.578 216 128Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
