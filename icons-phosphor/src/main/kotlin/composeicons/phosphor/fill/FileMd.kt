package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorFillIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h152c2.209 0 4 1.791 4 4v100c0 2.329 1.016 4.543 2.781 6.062 1.765 1.52 4.105 2.194 6.409 1.848 3.975-.662 6.87-4.13 6.81-8.16v-135.75c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM144 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h15.32c19.66 0 36.21-15.48 36.67-35.13 .234-9.696-3.453-19.076-10.228-26.017C162.987 147.913 153.699 144 144 144ZM143.51 200h-7.51v-40h8c5.44-.004 10.648 2.208 14.421 6.127 3.774 3.919 5.788 9.206 5.579 14.643C163.58 191.59 154.34 200 143.51 200ZM104 152v55.73c.068 4.291-3.195 7.903-7.47 8.27-2.212 .147-4.386-.631-6.003-2.147C88.91 212.336 87.995 210.217 88 208v-30.62l-13.32 19c-1.014 1.495-2.489 2.619-4.2 3.2-3.333 1.079-6.981-.137-9-3L48 177.38v30.35c.068 4.291-3.195 7.903-7.47 8.27-2.212 .147-4.386-.631-6.003-2.147C32.91 212.336 31.995 210.217 32 208v-55.69c-.053-3.178 1.719-6.105 4.56-7.53 3.528-1.685 7.757-.572 10 2.63L68 178.05 89.27 147.66c1.782-2.633 4.915-4.012 8.06-3.55 3.851 .649 6.671 3.984 6.67 7.89Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
