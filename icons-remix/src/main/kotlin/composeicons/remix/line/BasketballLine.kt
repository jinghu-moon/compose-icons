package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BasketballLine: ImageVector
    get() {
        if (_basketballLine != null) return _basketballLine!!
        _basketballLine = remixIcon(
            name = "BasketballLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12.366 13.366 8.897 19.376C9.851 19.778 10.9 20 12 20c.462 0 .915-.039 1.356-.114-.257-1.822-.015-3.725 .785-5.494L12.366 13.366ZM15.884 15.397c-.532 1.259-.716 2.597-.587 3.893 1.22-.552 2.277-1.402 3.078-2.456L15.884 15.397ZM8.859 11.342C7.727 12.919 6.199 14.081 4.494 14.77c.532 1.444 1.468 2.69 2.672 3.605l3.469-6.009L8.859 11.342ZM19.962 11.211l-.258 .122c-1.084 .536-2.056 1.322-2.82 2.333l2.492 1.439C19.778 14.149 20 13.101 20 12c0-.266-.013-.529-.038-.789ZM4 12c0 .266 .013 .529 .038 .789 1.188-.536 2.253-1.364 3.078-2.453L4.624 8.897C4.222 9.851 4 10.9 4 12ZM16.835 5.626l-3.469 6.008 1.775 1.025c1.132-1.578 2.66-2.74 4.367-3.429C19.013 7.891 18.17 6.719 17.088 5.827l-.254-.201ZM12 4c-.462 0-.916 .039-1.357 .115 .259 1.823 .016 3.726-.784 5.495l1.775 1.025L15.103 4.624C14.149 4.222 13.1 4 12 4ZM8.703 4.71l-.191 .089C7.373 5.351 6.384 6.166 5.626 7.165L8.116 8.603C8.648 7.344 8.833 6.006 8.703 4.71Z"),
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
        return _basketballLine!!
    }

private var _basketballLine: ImageVector? = null
