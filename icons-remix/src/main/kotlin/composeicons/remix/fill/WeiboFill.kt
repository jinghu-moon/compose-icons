package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WeiboFill: ImageVector
    get() {
        if (_weiboFill != null) return _weiboFill!!
        _weiboFill = remixIcon(
            name = "WeiboFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.278 8.592C7.051 5.822 10.282 4.559 11.497 5.776c.537 .537 .588 1.464 .244 2.572-.178 .558 .524 .25 .524 .25 2.241-.937 4.196-.993 4.909 .028 .379 .542 .344 1.306-.008 2.19-.163 .407 .048 .471 .359 .563 1.263 .392 2.668 1.337 2.668 3.005 0 2.763-3.98 6.238-9.963 6.238-4.565 0-9.23-2.213-9.23-5.851 0-1.902 1.204-4.102 3.277-6.177ZM16.411 14.334C16.174 11.943 13.029 10.295 9.388 10.657c-3.641 .359-6.404 2.59-6.167 4.981 .237 2.393 3.381 4.038 7.023 3.679 3.641-.362 6.401-2.592 6.167-4.983ZM6.162 14.438c.754-1.528 2.712-2.391 4.446-1.94 1.793 .464 2.707 2.154 1.976 3.799-.744 1.683-2.882 2.579-4.695 1.994C6.137 17.725 5.396 15.997 6.162 14.438ZM8.877 15.016c-.563-.237-1.291 .008-1.64 .552-.354 .547-.188 1.202 .372 1.457 .568 .257 1.324 .013 1.675-.55 .346-.568 .163-1.217-.407-1.459ZM10.264 14.438c-.216-.084-.486 .018-.614 .232-.122 .214-.053 .458 .163 .547 .219 .092 .502-.013 .629-.232 .122-.219 .043-.466-.178-.547ZM15.958 2.924c1.968-.418 4.097 .196 5.543 1.795 1.446 1.599 1.833 3.781 1.22 5.704-.141 .441-.617 .685-1.059 .54-.443-.145-.685-.619-.542-1.062 .438-1.36 .162-2.914-.866-4.051C19.224 4.712 17.712 4.276 16.312 4.574c-.456 .097-.902-.194-1.001-.649-.099-.456 .191-.904 .647-1.001ZM16.584 5.85c.957-.204 1.996 .094 2.699 .873 .703 .779 .891 1.843 .591 2.775-.123 .38-.533 .591-.914 .466-.382-.125-.588-.532-.463-.917 .15-.456 .056-.975-.288-1.357-.346-.379-.853-.525-1.322-.425-.392 .087-.777-.166-.861-.555-.084-.392 .165-.777 .558-.861Z"),
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
        return _weiboFill!!
    }

private var _weiboFill: ImageVector? = null
