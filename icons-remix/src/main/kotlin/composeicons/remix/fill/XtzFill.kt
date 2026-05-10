package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XtzFill: ImageVector
    get() {
        if (_xtzFill != null) return _xtzFill!!
        _xtzFill = remixIcon(
            name = "XtzFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.631 17.494c-.222-3.857-5.15-5.61-5.621-5.791-.02-.009-.02-.028-.01-.047L19.082 6.634v-.541c0-.085-.076-.161-.163-.161h-9.367v-3.932L6.096 2.711v.512h.192c0 0 .848 0 .848 .833v1.866h-2.676c-.048 0-.097 .047-.097 .095v1.185h2.782v6.434c0 2.019 1.319 3.422 3.629 3.231 .473-.045 .929-.207 1.329-.472 .085-.052 .155-.125 .204-.213 .049-.088 .075-.188 .076-.289v-.637c-.751 .493-1.388 .465-1.388 .465-1.463 0-1.434-1.83-1.434-1.83v-6.69h6.739l-4.851 4.814-.02 1.137c0 .02 .01 .029 .029 .029 4.447 .739 5.65 3.573 5.65 4.397 0 0 .481 4.008-3.59 4.284 0 0-2.667 .113-3.138-.938-.019-.039 0-.076 .038-.094 .443-.199 .741-.588 .741-1.109 0-.777-.481-1.412-1.492-1.412-.817 0-1.492 .635-1.492 1.412 0 0-.385 3.373 5.335 3.279 6.526-.114 6.121-5.504 6.121-5.504Z"),
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
        return _xtzFill!!
    }

private var _xtzFill: ImageVector? = null
