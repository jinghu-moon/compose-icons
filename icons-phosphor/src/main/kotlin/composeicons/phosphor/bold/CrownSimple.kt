package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorBoldIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.63 70c-8.016-3.906-17.653-1.979-23.55 4.71l-29.52 31.82L146.22 31.76l-.06-.14C142.891 24.536 135.802 19.999 128 19.999c-7.802 0-14.891 4.537-18.16 11.621l-.06 .14L76.44 106.52 46.92 74.7C40.962 68.043 31.312 66.144 23.276 70.048 15.241 73.952 10.769 82.712 12.32 91.51c0 .16 .06 .31 .09 .47L35.07 195.76c1.804 9.423 10.045 16.238 19.64 16.24h146.58c9.595-.002 17.836-6.817 19.64-16.24L243.59 92c0-.16 .07-.31 .09-.47C245.314 82.677 240.776 73.834 232.63 70ZM198.06 188h-140.12L39.06 101.51l32.14 34.65c2.739 2.975 6.793 4.37 10.783 3.711 3.99-.659 7.38-3.283 9.017-6.981L128 49.82l37 83.07c1.642 3.682 5.023 6.293 9 6.951 3.977 .658 8.019-.725 10.76-3.681l32.14-34.65Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
