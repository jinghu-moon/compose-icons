package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QqLine: ImageVector
    get() {
        if (_qqLine != null) return _qqLine!!
        _qqLine = remixIcon(
            name = "QqLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.536 12.514l-.696-1.797c.001-.021 .009-.375 .009-.557C16.849 7.088 15.448 4 12.001 4 8.555 4 7.153 7.088 7.153 10.16c0 .182 .009 .536 .009 .557l-.695 1.797c-.191 .514-.379 1.05-.517 1.509-.657 2.189-.444 3.095-.282 3.116 .348 .043 1.354-1.648 1.354-1.648 0 .98 .487 2.258 1.542 3.181-.394 .126-.878 .319-1.188 .556-.279 .214-.244 .431-.194 .519 .221 .386 3.79 .246 4.82 .126 1.03 .12 4.599 .26 4.82-.126 .05-.088 .085-.305-.194-.519-.311-.237-.794-.431-1.189-.557 1.054-.923 1.542-2.201 1.542-3.181 0 0 1.007 1.692 1.355 1.648 .162-.02 .378-.928-.282-3.116-.14-.463-.326-.995-.517-1.509ZM18.557 20.741c-.373 .652-.834 .893-1.439 1.057-.24 .065-.498 .108-.794 .138-.441 .045-.986 .065-1.613 .064-.926-.001-2.019-.051-2.71-.116-.691 .065-1.784 .115-2.71 .116-.627 .001-1.172-.019-1.613-.064-.296-.03-.554-.073-.794-.138C6.28 21.633 5.82 21.393 5.445 20.739c-.293-.514-.367-1.099-.239-1.653-.592-.132-1.001-.482-1.279-.911-.148-.229-.243-.463-.309-.709-.088-.332-.124-.7-.117-1.106 .013-.785 .187-1.762 .533-2.912 .14-.466 .327-1.009 .567-1.656l.553-1.429c-.001-.076-.002-.148-.002-.203C5.153 5.605 7.589 2 12.001 2c4.412 0 6.848 3.605 6.848 8.16 0 .055-.001 .126-.002 .203l.553 1.429 .01 .027c.225 .606 .413 1.153 .556 1.626 .348 1.151 .522 2.128 .535 2.916 .007 .407-.029 .775-.118 1.108-.066 .246-.161 .479-.309 .708-.277 .427-.684 .776-1.277 .909 .129 .555 .055 1.141-.24 1.654Z"),
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
        return _qqLine!!
    }

private var _qqLine: ImageVector? = null
