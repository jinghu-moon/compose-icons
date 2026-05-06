package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ImageCircleAiLine: ImageVector
    get() {
        if (_imageCircleAiLine != null) return _imageCircleAiLine!!
        _imageCircleAiLine = remixIcon(
            name = "ImageCircleAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM12 4C7.582 4 4 7.582 4 12c0 2.464 1.114 4.667 2.865 6.135l7.428-7.428c.391-.391 1.024-.391 1.414 0l3.869 3.869c.001-.003 .002-.007 .004-.011C19.852 13.76 20 12.898 20 12c0-.323-.019-.642-.056-.955l1.986-.236c.046 .391 .07 .788 .07 1.191 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c.861 0 1.699 .109 2.498 .315L14 4.252C13.362 4.088 12.692 4 12 4ZM10.813 19.913c.387 .058 .783 .087 1.187 .087 2.762 0 5.2-1.399 6.638-3.533L15 12.828 8.589 19.239l.004 .002c.691 .326 1.437 .556 2.22 .672ZM11 10c0 1.105-.895 2-2 2C7.895 12 7 11.105 7 10 7 8.895 7.895 8 9 8c1.105 0 2 .895 2 2Z"),
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
        return _imageCircleAiLine!!
    }

private var _imageCircleAiLine: ImageVector? = null
