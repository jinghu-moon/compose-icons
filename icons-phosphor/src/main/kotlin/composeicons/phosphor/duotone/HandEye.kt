package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorDuotoneIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 96c-11.046 0-20 8.954-20 20v-56C168 48.954 159.046 40 148 40c-11.046 0-20 8.954-20 20v-16C128 32.954 119.046 24 108 24 96.954 24 88 32.954 88 44v32C88 64.954 79.046 56 68 56 56.954 56 48 64.954 48 76v76c0 44.183 35.817 80 80 80 44.183 0 80-35.817 80-80v-36c0-11.046-8.954-20-20-20ZM128 200C96 200 80 168 80 168c0 0 16-32 48-32 32 0 48 32 48 32 0 0-16 32-48 32Z"),
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
                pathData = parseSvgPathData("M188 88c-4.152-.006-8.253 .92-12 2.71v-30.71c-.003-9.871-5.203-19.012-13.687-24.058-8.484-5.046-18.998-5.252-27.673-.542C130.399 22.294 117.255 14.219 103.647 16.361 90.039 18.503 80.01 30.224 80 44v6.71C76.253 48.92 72.152 47.994 68 48 52.536 48 40 60.536 40 76v76c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-36C216 100.536 203.464 88 188 88ZM200 152c0 39.764-32.236 72-72 72C88.235 224 56 191.764 56 152v-76C56 69.373 61.373 64 68 64c6.627 0 12 5.373 12 12v36c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-68c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v60c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v60c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM140 168c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 128c-36.52 0-54.41 34.94-55.16 36.42-1.128 2.253-1.128 4.907 0 7.16C73.59 173.06 91.48 208 128 208c36.52 0 54.41-34.94 55.16-36.42 1.128-2.253 1.128-4.907 0-7.16C182.41 162.94 164.52 128 128 128ZM128 192C107.37 192 94.2 175.48 89.3 168c4.9-7.48 18.07-24 38.7-24 20.63 0 33.81 16.53 38.7 24-4.9 7.48-18.07 24-38.7 24Z"),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
