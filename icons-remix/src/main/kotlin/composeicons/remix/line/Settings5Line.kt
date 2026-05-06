package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings5Line: ImageVector
    get() {
        if (_settings5Line != null) return _settings5Line!!
        _settings5Line = remixIcon(
            name = "Settings5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.212 14.06C1.919 12.675 1.931 11.274 2.213 9.94c1.11 .131 2.079-.237 2.395-1.002C4.925 8.174 4.5 7.229 3.623 6.537 4.367 5.394 5.349 4.395 6.536 3.623c.692 .878 1.638 1.303 2.403 .986C9.703 4.292 10.071 3.323 9.94 2.213c1.385-.293 2.786-.281 4.12 .001-.131 1.11 .237 2.079 1.002 2.395 .765 .317 1.71-.108 2.402-.986 1.143 .744 2.142 1.726 2.914 2.912-.878 .692-1.303 1.638-.986 2.403 .317 .765 1.286 1.133 2.396 1.002 .293 1.385 .281 2.786-.001 4.12-1.11-.131-2.079 .237-2.396 1.002-.317 .765 .108 1.71 .986 2.402-.744 1.143-1.726 2.142-2.913 2.914-.692-.878-1.638-1.303-2.403-.986-.765 .317-1.133 1.286-1.002 2.396-1.385 .293-2.786 .281-4.12-.001 .131-1.11-.237-2.079-1.002-2.396-.765-.317-1.71 .108-2.402 .986C5.393 19.633 4.394 18.651 3.622 17.464c.878-.692 1.303-1.638 .986-2.403C4.292 14.297 3.323 13.929 2.212 14.06ZM4 12.21c1.1 .304 2.007 1.001 2.457 2.086 .449 1.085 .3 2.219-.262 3.212 .097 .102 .196 .201 .298 .297 .993-.562 2.127-.711 3.212-.262 1.085 .449 1.781 1.357 2.086 2.456 .14 .004 .28 .004 .42 0 .304-1.1 1.001-2.007 2.086-2.457 1.084-.449 2.219-.3 3.212 .262 .102-.097 .201-.196 .297-.298-.562-.993-.711-2.127-.262-3.212 .449-1.085 1.357-1.781 2.456-2.086 .004-.14 .004-.28 0-.421C18.9 11.486 17.992 10.789 17.543 9.704c-.449-1.085-.3-2.219 .262-3.212-.097-.102-.196-.201-.298-.297-.993 .562-2.127 .711-3.212 .262C13.211 6.008 12.514 5.1 12.21 4c-.14-.004-.28-.004-.421-0C11.485 5.1 10.788 6.008 9.704 6.457 8.619 6.906 7.484 6.757 6.492 6.195c-.102 .097-.201 .196-.297 .298 .562 .993 .711 2.127 .262 3.212-.449 1.084-1.357 1.781-2.456 2.086-.004 .14-.004 .28-0 .42ZM12 15c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM12 13c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _settings5Line!!
    }

private var _settings5Line: ImageVector? = null
