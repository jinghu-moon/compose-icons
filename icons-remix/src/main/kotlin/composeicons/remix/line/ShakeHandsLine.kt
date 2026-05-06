package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShakeHandsLine: ImageVector
    get() {
        if (_shakeHandsLine != null) return _shakeHandsLine!!
        _shakeHandsLine = remixIcon(
            name = "ShakeHandsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.861 2.391c.988-.659 2.273-.673 3.275-.035l4.155 2.644h1.709c.552 0 1 .448 1 1v9c0 .552-.448 1-1 1h-1.52c.059 .947-.387 1.91-1.285 2.449l-5.093 3.056c-.643 .386-1.441 .377-2.071-.008-.7 .619-1.778 .688-2.56 .073L3.33 17.531c-.766-.602-.96-1.631-.564-2.447C2.282 14.706 2 14.125 2 13.511v-7.511C2 5.448 2.448 5 3 5h4.947L11.861 2.391ZM4.173 13.645l.692-.606c1.23-1.076 3.096-.97 4.195 .24l2.702 2.972c.869 .956 1.028 2.362 .396 3.487l5.009-3.005c.281-.169 .383-.506 .278-.791L13.018 9.746c-.249-.348-.691-.5-1.101-.377l-2.485 .746c-1.057 .317-2.203 .028-2.983-.752L6.155 9.07C5.587 8.502 5.44 7.693 5.679 7h-1.679v6.511l.173 .134ZM14.062 4.043c-.334-.213-.762-.208-1.092 .012L7.569 7.655l.293 .293c.26 .26 .642 .356 .994 .251l2.485-.746c1.229-.369 2.557 .085 3.303 1.13l3.869 5.417h1.485v-7h-.709c-.38 0-.753-.108-1.074-.313L14.062 4.043ZM6.182 14.545 4.566 15.959l5.141 4.039 .704-1.232c.215-.376 .163-.848-.128-1.169L7.58 14.625c-.367-.403-.988-.439-1.398-.08Z"),
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
        return _shakeHandsLine!!
    }

private var _shakeHandsLine: ImageVector? = null
