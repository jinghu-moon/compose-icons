package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CigaretteSlash: ImageVector
    get() {
        if (_cigaretteSlash != null) return _cigaretteSlash!!
        _cigaretteSlash = phosphorBoldIcon(
            name = "CigaretteSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.67 55.89c7.53-12.71 7.12-19.63 5.07-21.1-5.558-2.998-7.841-9.791-5.222-15.537 2.619-5.746 9.243-8.48 15.152-6.253 6.62 3.082 11.632 8.817 13.8 15.79 3.6 10.92 .86 24.17-8.14 39.38-7.53 12.7-7.12 19.63-5.07 21.1 5.846 2.848 8.359 9.835 5.668 15.754-2.691 5.92-9.608 8.618-15.598 6.086-6.613-3.093-11.621-8.823-13.8-15.79-3.6-10.98-.86-24.23 8.14-39.43ZM145.53 95.27c2.179 6.967 7.187 12.697 13.8 15.79 5.989 2.533 12.906-.166 15.598-6.086 2.691-5.92 .178-12.906-5.668-15.754-2-1.47-2.46-8.4 5.07-21.1 9-15.21 11.74-28.46 8.14-39.38C180.29 21.785 175.28 16.071 168.67 13c-5.989-2.533-12.906 .166-15.598 6.086-2.691 5.92-.178 12.906 5.668 15.754 2 1.47 2.46 8.39-5.07 21.1-9 15.15-11.74 28.4-8.14 39.33ZM216.88 207.93c2.945 3.163 3.961 7.665 2.661 11.786-1.3 4.121-4.716 7.225-8.942 8.126-4.227 .901-8.611-.54-11.479-3.773L173.6 196h-141.6C20.954 196 12 187.046 12 176v-32c0-11.046 8.954-20 20-20h76.15l-69-75.93C36.035 44.941 34.89 40.354 36.169 36.129c1.279-4.226 4.775-7.408 9.102-8.285 4.327-.877 8.786 .693 11.61 4.087ZM36 172h40v-24h-40ZM151.78 172 130 148h-30v24ZM224 124h-34.67c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h30.67v34.94c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-38.94c0-11.046-8.954-20-20-20Z"),
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
        return _cigaretteSlash!!
    }

private var _cigaretteSlash: ImageVector? = null
