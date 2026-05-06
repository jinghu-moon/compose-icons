package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorThinIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 116c-19.23 .05-36.217 12.54-42 30.88-1.969-.442-3.982-.663-6-.66-15.44 0-28 13-28 28.89C124 191 136.56 204 152 204h48c24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44ZM200 196h-48c-11 0-20-9.37-20-20.89 0-11.52 9-20.89 20-20.89 2.5-.004 4.977 .482 7.29 1.43 1.103 .453 2.35 .391 3.402-.17 1.052-.561 1.799-1.562 2.038-2.73 3.814-18.55 21.347-30.973 40.112-28.422 18.765 2.551 32.345 19.204 31.069 38.098C234.634 181.321 218.938 195.996 200 196ZM20 160v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16C12.003 119.811 36.065 83.528 73.087 67.889c37.022-15.639 79.809-7.595 108.623 20.421 1.325 1.576 1.237 3.901-.203 5.372-1.441 1.472-3.763 1.609-5.367 .318C149.625 68.215 110.247 60.814 76.18 75.214 42.114 89.614 19.982 123.015 20 160ZM112 100c-33.121 .039-59.961 26.879-60 60v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16C43.998 134.368 58.41 110.913 81.276 99.332c22.866-11.581 50.302-9.32 70.964 5.848 1.2 .828 1.854 2.244 1.707 3.694-.147 1.451-1.071 2.706-2.412 3.278-1.341 .571-2.887 .367-4.035-.532C137.218 104.041 124.773 99.967 112 100ZM123.31 129.79c-.238 1.037-.879 1.936-1.782 2.499-.903 .563-1.992 .743-3.028 .501-8.331-1.988-17.114-.054-23.84 5.25C87.935 143.344 84.008 151.435 84 160v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-19.882 16.118-36 36-36 2.813 .011 5.614 .347 8.35 1 2.134 .514 3.455 2.652 2.96 4.79Z"),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
