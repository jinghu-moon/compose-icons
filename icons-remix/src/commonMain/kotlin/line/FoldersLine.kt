package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FoldersLine: ImageVector
    get() {
        if (_foldersLine != null) return _foldersLine!!
        _foldersLine = remixIcon(
            name = "FoldersLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 7.000 L 6.000 4.000 C 6.000 3.448 6.448 3.000 7.000 3.000 L 13.414 3.000 L 15.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 16.000 C 22.000 16.552 21.552 17.000 21.000 17.000 L 18.000 17.000 L 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 8.000 C 2.000 7.448 2.448 7.000 3.000 7.000 L 6.000 7.000 ZM 6.000 9.000 L 4.000 9.000 L 4.000 19.000 L 16.000 19.000 L 16.000 17.000 L 6.000 17.000 L 6.000 9.000 ZM 8.000 5.000 L 8.000 15.000 L 20.000 15.000 L 20.000 7.000 L 14.586 7.000 L 12.586 5.000 L 8.000 5.000 Z"),
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
        return _foldersLine!!
    }

private var _foldersLine: ImageVector? = null
