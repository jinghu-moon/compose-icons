package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraOffLine: ImageVector
    get() {
        if (_cameraOffLine != null) return _cameraOffLine!!
        _cameraOffLine = remixIcon(
            name = "CameraOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.586 21h-16.586c-.552 0-1-.448-1-1v-14c0-.552 .448-1 1-1h.586L1.394 2.808 2.808 1.393 22.607 21.192l-1.414 1.414L19.586 21ZM5.586 7h-1.586v12h13.586L15.405 16.819C14.469 17.559 13.286 18 12 18 8.963 18 6.5 15.538 6.5 12.5c0-1.286 .441-2.469 1.181-3.405L5.586 7ZM9.111 10.525c-.385 .562-.61 1.243-.61 1.975 0 1.933 1.567 3.5 3.5 3.5 .733 0 1.413-.225 1.975-.61L9.111 10.525ZM22 17.786l-2-2v-8.786h-3.829l-2-2h-4.343l-.307 .307L8.107 3.893l.893-.893h6l2 2h4c.552 0 1 .448 1 1v11.786ZM11.263 7.049c.241-.032 .487-.049 .737-.049 3.037 0 5.5 2.462 5.5 5.5 0 .25-.017 .496-.049 .737L15.113 10.899c-.334-.648-.864-1.178-1.512-1.512L11.263 7.049Z"),
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
        return _cameraOffLine!!
    }

private var _cameraOffLine: ImageVector? = null
