package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorRegularIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 88c-4.152-.006-8.253 .92-12 2.71v-30.71c-.003-9.871-5.203-19.012-13.687-24.058-8.484-5.046-18.998-5.252-27.673-.542C130.399 22.294 117.255 14.219 103.647 16.361 90.039 18.503 80.01 30.224 80 44v6.71C76.253 48.92 72.152 47.994 68 48 52.536 48 40 60.536 40 76v76c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-36C216 100.536 203.464 88 188 88ZM200 152c0 39.764-32.236 72-72 72C88.235 224 56 191.764 56 152v-76C56 69.373 61.373 64 68 64c6.627 0 12 5.373 12 12v44c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-76c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-52c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v68.67c-23.078 3.934-39.968 23.919-40 47.33 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-17.673 14.327-32 32-32 4.418 0 8-3.582 8-8v-20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
