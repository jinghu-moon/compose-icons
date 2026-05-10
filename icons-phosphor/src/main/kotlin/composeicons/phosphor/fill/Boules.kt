package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorFillIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128c0 56.63-47.38 104-104 104-10.696 .006-21.329-1.644-31.52-4.89-1.335-.421-2.353-1.508-2.684-2.868-.331-1.36 .072-2.794 1.064-3.782L220.46 94.85c.987-.992 2.422-1.396 3.782-1.064 1.36 .331 2.448 1.349 2.868 2.684 3.247 10.195 4.896 20.831 4.89 31.53ZM215.84 72.39c-1.874-2.954-3.896-5.811-6.06-8.56-.711-.905-1.777-1.459-2.925-1.522-1.149-.063-2.269 .371-3.075 1.192L63.5 203.82c-.821 .806-1.256 1.926-1.192 3.075 .063 1.149 .618 2.215 1.522 2.925 2.749 2.164 5.606 4.186 8.56 6.06 1.586 1.021 3.669 .796 5-.54L215.3 77.39c1.336-1.331 1.561-3.414 .54-5ZM192.17 46.22c-2.749-2.164-5.606-4.186-8.56-6.06-1.586-1.021-3.669-.796-5 .54L40.7 178.62c-1.336 1.331-1.561 3.414-.54 5 1.874 2.954 3.896 5.811 6.06 8.56 .711 .905 1.777 1.459 2.925 1.522 1.149 .063 2.269-.371 3.075-1.192L192.5 52.18c.807-.805 1.233-1.916 1.17-3.054-.063-1.138-.609-2.195-1.5-2.906ZM159.53 28.89C149.335 25.643 138.699 23.993 128 24 71.38 24 24 71.37 24 128c-.006 10.699 1.643 21.335 4.89 31.53 .421 1.335 1.508 2.353 2.868 2.684 1.36 .331 2.794-.072 3.782-1.064L161.15 35.54c.992-.987 1.396-2.422 1.064-3.782-.331-1.36-1.349-2.448-2.684-2.868Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
