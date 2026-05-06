package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorLightIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.14 62.17C224.13 54.94 215.387 50.532 206 50 205.148 35.846 195.6 23.706 182.045 19.542c-13.555-4.164-28.271 .522-36.922 11.757C136.471 42.534 135.701 57.959 143.19 70c.543 .792 .447 1.858-.23 2.54L72.56 143c-.693 .66-1.75 .755-2.55 .23-12.038-7.527-27.485-6.782-38.743 1.868-11.258 8.651-15.955 23.386-11.781 36.956C23.66 195.624 35.827 205.172 50 206c.852 14.154 10.4 26.294 23.955 30.458 13.555 4.164 28.271-.522 36.922-11.757 8.652-11.235 9.422-26.66 1.933-38.701-.543-.792-.447-1.858 .23-2.54l70.4-70.4c.682-.677 1.748-.773 2.54-.23 14.176 8.938 32.751 6.213 43.763-6.42 11.012-12.633 11.176-31.406 .387-44.23ZM220.6 98.48c-7.111 8.137-19.08 9.905-28.24 4.17-5.534-3.512-12.765-2.714-17.4 1.92L104.57 175c-4.634 4.635-5.432 11.866-1.92 17.4 5.16 8.28 4.251 18.969-2.233 26.258-6.484 7.289-16.995 9.438-25.819 5.278C65.773 219.776 60.743 210.3 62.24 200.66c.272-1.733-.228-3.498-1.369-4.831-1.14-1.333-2.807-2.1-4.561-2.099-.311 .003-.622 .027-.93 .07-9.64 1.497-19.116-3.533-23.276-12.358-4.16-8.825-2.012-19.335 5.278-25.819 7.289-6.484 17.979-7.393 26.258-2.233 5.534 3.48 12.741 2.667 17.36-1.96L151.43 81c4.634-4.635 5.432-11.866 1.92-17.4-5.16-8.28-4.251-18.969 2.233-26.258 6.484-7.289 16.995-9.438 25.819-5.278 8.825 4.16 13.855 13.635 12.358 23.276-.298 1.895 .328 3.819 1.684 5.176 1.357 1.357 3.28 1.983 5.176 1.684 9.158-1.462 18.248 2.976 22.729 11.095 4.481 8.119 3.389 18.176-2.729 25.145Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
