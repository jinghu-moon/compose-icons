package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorDuotoneIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 124c.006 20.347-12.817 38.488-32 45.27h0v6.73c0 22.091-17.909 40-40 40-22.091 0-40-17.909-40-40 0 22.091-17.909 40-40 40C65.909 216 48 198.091 48 176v-6.73h0C28.8 162.502 15.957 144.358 15.957 124 15.957 103.642 28.8 85.498 48 78.73v-6.73C48 49.909 65.909 32 88 32c22.091 0 40 17.909 40 40 0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40v6.73c19.183 6.782 32.006 24.923 32 45.27Z"),
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
                pathData = parseSvgPathData("M248 124C247.978 102.373 235.529 82.683 216 73.39v-1.39C215.981 50.835 202.102 32.181 181.836 26.08 161.569 19.98 139.699 27.873 128 45.51 116.301 27.873 94.431 19.98 74.164 26.08 53.898 32.181 40.019 50.835 40 72v1.39C20.453 82.658 7.992 102.357 7.992 123.99c0 21.633 12.46 41.332 32.008 50.6v1.41c.019 21.165 13.898 39.819 34.164 45.92 20.266 6.101 42.137-1.793 53.836-19.43 11.699 17.637 33.569 25.53 53.836 19.43C202.102 215.819 215.981 197.165 216 176v-1.41c19.526-9.286 31.976-28.969 32-50.59ZM88 208C71.66 207.998 57.947 195.685 56.19 179.44c2.587 .369 5.197 .556 7.81 .56h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8C44.5 164.023 27.825 149.981 24.529 130.761 21.233 111.541 32.276 92.746 50.67 86.27 53.864 85.139 55.999 82.118 56 78.73v-6.73C56 54.327 70.327 40 88 40c17.673 0 32 14.327 32 32v68.26C111.215 132.359 99.815 127.991 88 128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM192 164h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c2.613-.004 5.223-.191 7.81-.56-1.852 17.127-16.93 29.714-34.112 28.477-17.182-1.237-30.302-15.854-29.682-33.069C136.636 157.633 150.773 143.998 168 144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-11.815-.009-23.215 4.359-32 12.26v-68.26c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32v6.73c.001 3.388 2.136 6.409 5.33 7.54 18.394 6.476 29.437 25.271 26.141 44.491C228.175 149.981 211.5 164.023 192 164ZM208 112c0 4.418-3.582 8-8 8h-4c-19.882 0-36-16.118-36-36v-4c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v4c0 11.046 8.954 20 20 20h4c4.418 0 8 3.582 8 8ZM60 120h-4c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h4c11.046 0 20-8.954 20-20v-4c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v4c0 19.882-16.118 36-36 36Z"),
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
        return _brain!!
    }

private var _brain: ImageVector? = null
