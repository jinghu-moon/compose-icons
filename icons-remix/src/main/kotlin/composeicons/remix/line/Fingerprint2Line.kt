package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Fingerprint2Line: ImageVector
    get() {
        if (_fingerprint2Line != null) return _fingerprint2Line!!
        _fingerprint2Line = remixIcon(
            name = "Fingerprint2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c4.971 0 9 4.029 9 9v4c0 4.971-4.029 9-9 9-1.086 0-2.128-.192-3.092-.545 .128-.177 .251-.357 .369-.542l.171-.28c.94-1.569 1.498-3.394 1.548-5.345L11 16v-7h2v7c0 1.772-.355 3.462-.997 5.001 .792-.001 1.557-.134 2.269-.379 .442-1.361 .694-2.808 .724-4.309L15 16l-0-3.001h2L17 16c0 1.088-.102 2.153-.298 3.185 1.356-1.229 2.228-2.985 2.294-4.944L19 14v-4C19 6.134 15.866 3 12 3 10.428 3 8.976 3.518 7.808 4.394L6.383 2.968C7.922 1.736 9.875 1 12 1ZM7 10C7 7.239 9.239 5 12 5c2.761 0 5 2.239 5 5v1h-2v-1C15 8.343 13.657 7 12 7 10.402 7 9.096 8.249 9.005 9.824L9 10v6c0 1.567-.4 3.04-1.104 4.323l-.023 .039c-.229 .414-.491 .808-.782 1.179-.441-.287-.855-.612-1.238-.97l-.308-.301C3.97 18.65 3 16.438 3 14v-4C3 7.875 3.736 5.922 4.968 4.383L6.394 5.808C5.563 6.917 5.054 8.28 5.004 9.759L5 10v4c0 1.675 .588 3.212 1.569 4.417 .253-.682 .401-1.413 .427-2.176L7 16v-6Z"),
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
        return _fingerprint2Line!!
    }

private var _fingerprint2Line: ImageVector? = null
