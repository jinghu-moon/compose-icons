package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WechatLine: ImageVector
    get() {
        if (_wechatLine != null) return _wechatLine!!
        _wechatLine = remixIcon(
            name = "WechatLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.001 14.676c-0-.021-0-.041-0-.062 0-2.508 2.016-4.618 4.753-5.233C14.39 7.079 11.96 5.2 8.901 5.2 5.58 5.2 3.001 7.413 3.001 9.979c0 .969 .36 1.901 1.04 2.699 .032 .038 .084 .094 .153 .165 .592 .609 .944 1.403 1.002 2.238 .713-.412 1.547-.568 2.363-.441 .166 .026 .302 .045 .405 .059 .308 .04 .621 .06 .938 .06 .377 0 .745-.029 1.1-.083ZM10.458 16.627c-.503 .086-1.024 .132-1.557 .132-.407 0-.806-.026-1.196-.077-.122-.016-.273-.038-.454-.066-.374-.058-.756 .017-1.079 .211L4.267 17.975c-.146 .09-.318 .131-.489 .117-.439-.036-.766-.417-.729-.851l.15-1.781c.038-.451-.122-.896-.439-1.223-.097-.1-.178-.188-.241-.262C1.564 12.854 1.001 11.473 1.001 9.979 1.001 6.235 4.538 3.2 8.901 3.2c4.059 0 7.403 2.627 7.849 6.008 3.372 .153 6.051 2.515 6.051 5.406 0 1.193-.456 2.296-1.229 3.191-.051 .059-.117 .129-.196 .209-.257 .261-.387 .616-.356 .977l.122 1.422c.03 .347-.235 .651-.59 .68-.139 .011-.278-.021-.396-.094l-1.543-.917c-.262-.156-.572-.215-.875-.169-.147 .023-.269 .04-.368 .053-.316 .041-.64 .062-.969 .062-2.694 0-4.998-1.408-5.943-3.401ZM17.435 17.936c.567-.087 1.145-.025 1.676 .175 .139-.561 .427-1.081 .842-1.502 .05-.051 .086-.09 .106-.112 .488-.565 .743-1.213 .743-1.883 0-1.804-1.903-3.414-4.4-3.414-2.497 0-4.4 1.609-4.4 3.414 0 1.804 1.903 3.414 4.4 3.414 .241 0 .48-.015 .714-.045 .081-.01 .188-.026 .32-.046Z"),
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
        return _wechatLine!!
    }

private var _wechatLine: ImageVector? = null
