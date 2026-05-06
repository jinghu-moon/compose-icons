package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorBoldIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.41 155.16c-3.48-2.197-7.843-2.458-11.56-.69-5.122 2.441-11.154 1.986-15.853-1.195C190.298 150.094 187.636 144.663 188 139c.563-7.964 6.844-14.33 14.8-15 2.752-.206 5.51 .311 8 1.5 3.716 1.787 8.089 1.541 11.581-.652 3.492-2.193 5.614-6.025 5.619-10.148v-42.7C228 60.954 219.046 52 208 52h-32C175.982 40.958 171.417 30.411 163.38 22.84 155.338 15.233 144.484 11.332 133.44 12.08 113.514 13.389 97.592 29.167 96.1 49.08 96 50.07 96 51 96 52h-32C52.954 52 44 60.954 44 72v28c-11.042 .018-21.589 4.583-29.16 12.62C4.279 123.864 1.125 140.179 6.734 154.549c5.609 14.37 18.981 24.234 34.366 25.351 .964 .083 1.932 .116 2.9 .1v28c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-42.69c.002-4.118-2.108-7.95-5.59-10.15ZM204 204h-136v-38.69c0-4.116-2.109-7.946-5.589-10.145-3.48-2.199-7.844-2.462-11.561-.695-2.504 1.205-5.279 1.732-8.05 1.53C34.865 155.334 28.591 149 28 141.06c-.377-5.663 2.274-11.102 6.967-14.293 4.693-3.192 10.725-3.658 15.853-1.227 3.721 1.781 8.095 1.525 11.583-.676 3.488-2.201 5.602-6.04 5.597-10.164v-38.7h42.7c4.115-.003 7.941-2.114 10.138-5.593 2.197-3.479 2.458-7.841 .692-11.557C120.325 56.346 119.798 53.571 120 50.8c.662-7.936 6.998-14.213 14.94-14.8 5.662-.379 11.101 2.269 14.294 6.96 3.193 4.69 3.664 10.722 1.236 15.85-1.785 3.722-1.532 8.099 .669 11.591 2.202 3.491 6.043 5.606 10.171 5.599h42.69v24c-1 0-1.93 0-2.9 .11-21.443 1.593-37.79 19.853-37.01 41.341 .78 21.488 18.408 38.515 39.91 38.549h0Z"),
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
