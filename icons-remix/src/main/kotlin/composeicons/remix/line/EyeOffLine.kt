package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EyeOffLine: ImageVector
    get() {
        if (_eyeOffLine != null) return _eyeOffLine!!
        _eyeOffLine = remixIcon(
            name = "EyeOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.883 19.297c-1.701 1.079-3.719 1.703-5.882 1.703-5.392 0-9.878-3.88-10.819-9C1.618 9.623 2.819 7.513 4.52 5.935L1.394 2.808 2.808 1.394 22.607 21.192l-1.414 1.414L17.883 19.297ZM5.936 7.35C4.607 8.56 3.638 10.167 3.223 12c.917 4.052 4.542 7 8.778 7 1.599 0 3.112-.42 4.424-1.162L14.396 15.81c-.694 .437-1.515 .69-2.396 .69-2.485 0-4.5-2.015-4.5-4.5 0-.881 .253-1.702 .69-2.396L5.936 7.35ZM12.914 14.328 9.672 11.087c-.111 .283-.172 .591-.172 .914 0 1.381 1.119 2.5 2.5 2.5 .322 0 .631-.061 .914-.172ZM20.807 16.593 19.376 15.162c.656-.935 1.139-2.003 1.402-3.161C19.86 7.948 16.236 5 12 5c-.846 0-1.667 .118-2.448 .338L7.974 3.76c1.247-.491 2.605-.76 4.026-.76 5.392 0 9.878 3.88 10.819 9-.312 1.7-1.015 3.263-2.012 4.592ZM11.723 7.509c.092-.006 .184-.008 .277-.008 2.485 0 4.5 2.015 4.5 4.5 0 .093-.003 .186-.008 .277L11.723 7.509Z"),
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
        return _eyeOffLine!!
    }

private var _eyeOffLine: ImageVector? = null
