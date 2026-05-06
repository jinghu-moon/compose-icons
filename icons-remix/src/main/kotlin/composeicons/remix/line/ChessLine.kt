package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChessLine: ImageVector
    get() {
        if (_chessLine != null) return _chessLine!!
        _chessLine = remixIcon(
            name = "ChessLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.5 .287c-.691 .286-1.359 .616-2 .987C8.419 4.214 5 9.708 5 16h-1v4h-1v2h17v-2h-1v-4h-1.192c-.15-.684-.395-1.299-.759-1.85-.567-.858-1.422-1.562-2.659-2.131-.131-.06-.262-.117-.395-.172-.114-.047-.146-.195-.059-.283 .054-.054 .122-.053 .191-.039l1.753 .351 2.413 .483c.422 .084 .851-.111 1.064-.484L20.653 9.608c.208-.365 .167-.821-.105-1.142L15.5 2.5v-2.213ZM17 20h-11v-2h11v2ZM7 16C7 10.779 9.668 6.178 13.719 3.491l4.851 5.732-.59 1.033L14.482 9.557c-.711-.142-1.447 .08-1.96 .593-1.133 1.132-.675 2.977 .713 3.547 1.247 .512 1.859 1.082 2.201 1.642 .117 .193 .219 .41 .302 .661h-8.738ZM14 8c.552 0 1-.448 1-1C15 6.448 14.552 6 14 6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _chessLine!!
    }

private var _chessLine: ImageVector? = null
