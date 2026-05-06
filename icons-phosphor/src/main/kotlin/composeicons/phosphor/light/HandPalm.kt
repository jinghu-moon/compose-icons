package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorLightIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 90c-4.965-.006-9.826 1.421-14 4.11v-34.11c-.004-9.623-5.323-18.457-13.826-22.963-8.503-4.506-18.799-3.947-26.764 1.453C130.595 25.504 118.441 16.729 105.229 18.145 92.017 19.562 81.999 30.712 82 44v10.11C73.999 48.997 63.848 48.653 55.518 53.211 47.189 57.769 42.007 66.505 42 76v76c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86v-36C214 101.641 202.359 90 188 90ZM202 152c0 40.869-33.131 74-74 74C87.131 226 54 192.869 54 152v-76C54 68.268 60.268 62 68 62c7.732 0 14 6.268 14 14v44c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-76c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v68c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-52c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v70.39c-22.874 3.04-39.971 22.535-40 45.61 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-18.778 15.222-34 34-34 3.314 0 6-2.686 6-6v-20c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
