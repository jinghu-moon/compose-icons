package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PokerSpadesLine: ImageVector
    get() {
        if (_pokerSpadesLine != null) return _pokerSpadesLine!!
        _pokerSpadesLine = remixIcon(
            name = "PokerSpadesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 15.916c-.118-.449-.39-.85-.782-1.126-.593-.418-1.365-.482-2.018-.168C8.703 14.86 8.126 15 7.5 15 5.383 15 4 13.482 4 12 4 10.94 4.515 9.885 5.613 8.71 6.746 7.498 8.268 6.399 9.898 5.224c.693-.499 1.421-1.024 2.102-1.566 .681 .542 1.409 1.067 2.102 1.566 1.631 1.175 3.152 2.274 4.285 3.486C19.485 9.885 20 10.94 20 12c0 1.482-1.383 3-3.5 3-.626 0-1.203-.14-1.7-.379-.654-.314-1.426-.25-2.018 .168-.391 .276-.664 .678-.782 1.126ZM12 1C11.129 1.871 9.92 2.742 8.644 3.662 5.525 5.911 2 8.452 2 12c0 2.761 2.462 5 5.5 5 .927 0 1.8-.208 2.566-.576-.092 .867-.278 1.606-.536 2.317-.22 .604-.491 1.188-.801 1.814C8.398 21.22 8.875 22 9.618 22h4.764c.743 0 1.22-.78 .89-1.446-.31-.625-.582-1.209-.801-1.814-.258-.711-.444-1.45-.536-2.317 .766 .368 1.639 .576 2.566 .576C19.538 17 22 14.761 22 12 22 8.452 18.475 5.911 15.356 3.662 14.08 2.742 12.871 1.871 12 1ZM12 17.074c.158 1.111 .451 2.047 .815 2.926h-1.629c.363-.879 .656-1.816 .815-2.926Z"),
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
        return _pokerSpadesLine!!
    }

private var _pokerSpadesLine: ImageVector? = null
