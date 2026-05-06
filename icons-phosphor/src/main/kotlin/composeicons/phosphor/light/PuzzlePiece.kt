package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorLightIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.21 160.24c-1.739-1.1-3.921-1.232-5.78-.35-7.981 3.77-17.444 2.405-24.034-3.468-6.59-5.873-9.032-15.116-6.202-23.477 2.83-8.361 10.383-14.222 19.186-14.885 3.799-.275 7.605 .435 11.05 2.06 1.859 .881 4.039 .749 5.777-.351 1.738-1.099 2.792-3.012 2.793-5.069v-42.7c0-7.732-6.268-14-14-14h-38.52c.345-1.981 .519-3.989 .52-6-.014-9.385-3.896-18.348-10.73-24.78-6.83-6.476-16.06-9.795-25.45-9.15-9.665 .623-18.606 5.338-24.579 12.963-5.973 7.624-8.41 17.434-6.701 26.967h-38.54C56.268 58 50 64.268 50 72v34.53c-11.328-2.03-22.914 1.808-30.79 10.2-8.971 9.556-11.65 23.418-6.886 35.629 4.764 12.211 16.123 20.595 29.196 21.551 2.834 .205 5.682 .057 8.48-.44v34.53c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-42.69c0-2.056-1.053-3.97-2.79-5.07ZM210 208c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-42.69c0-3.314-2.686-6-6-6-.889-.002-1.768 .196-2.57 .58-6.588 3.124-14.296 2.781-20.581-.916C26.565 155.277 22.52 148.706 22.05 141.43c-.508-7.782 3.142-15.251 9.594-19.632 6.451-4.381 14.74-5.02 21.786-1.678 1.859 .881 4.039 .749 5.777-.351 1.738-1.099 2.792-3.012 2.793-5.069v-42.7c0-1.105 .895-2 2-2h46.69c2.057-.001 3.97-1.055 5.069-2.793 1.099-1.738 1.232-3.919 .351-5.777-1.592-3.437-2.28-7.223-2-11 .64-8.812 6.49-16.387 14.855-19.233 8.365-2.846 17.621-.412 23.503 6.181 5.882 6.593 7.25 16.065 3.472 24.053-.877 1.849-.75 4.017 .335 5.752 1.085 1.735 2.979 2.797 5.025 2.818h46.7c1.105 0 2 .895 2 2v34.54c-9.533-1.709-19.343 .728-26.967 6.701-7.624 5.973-12.34 14.914-12.962 24.579-.639 9.387 2.675 18.614 9.14 25.45 7.889 8.372 19.462 12.209 30.79 10.21Z"),
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
