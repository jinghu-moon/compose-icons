package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorThinIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 92c-5.908-.004-11.608 2.179-16 6.13v-38.13c-.01-9.477-5.596-18.06-14.257-21.908-8.661-3.847-18.774-2.238-25.813 4.108C130.946 29.345 119.982 19.565 107.099 20.048 94.216 20.532 84.017 31.108 84 44v14.13C76.948 51.823 66.849 50.247 58.21 54.106 49.572 57.965 44.007 66.539 44 76v76c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84v-36C212 102.745 201.255 92 188 92ZM204 152c0 41.974-34.026 76-76 76C86.026 228 52 193.974 52 152v-76C52 67.163 59.163 60 68 60c8.837 0 16 7.163 16 16v44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-76c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v68c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v72.18c-22.644 2.095-39.973 21.08-40 43.82 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-19.882 16.118-36 36-36 2.209 0 4-1.791 4-4v-20c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
