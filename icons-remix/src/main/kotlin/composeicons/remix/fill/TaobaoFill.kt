package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TaobaoFill: ImageVector
    get() {
        if (_taobaoFill != null) return _taobaoFill!!
        _taobaoFill = remixIcon(
            name = "TaobaoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.576 8.277 2.383 10.119l2.201 1.371c0 0 1.463 .754 .762 2.169-.649 1.339-3.846 4.269-3.846 4.269l2.862 1.798C6.346 15.401 6.213 15.977 6.709 14.421c.512-1.58 .625-2.794-.242-3.677C5.354 9.619 5.229 9.514 3.576 8.277ZM5.141 7.583c1.04 0 1.883-.758 1.883-1.693C7.023 4.947 6.181 4.189 5.141 4.189c-1.048 0-1.887 .762-1.887 1.701 .004 .931 .839 1.693 1.887 1.693ZM22.146 7.793c0 0-.625-4.87-11.208-1.855 .456-.794 .669-1.306 .669-1.306L8.966 3.882c0 0-1.068 3.507-2.971 5.14 0 0 1.846 1.072 1.826 1.04C8.35 9.531 8.825 8.99 9.229 8.466c.423-.189 .83-.363 1.226-.524-.492 .887-1.278 2.217-2.068 3.056l1.113 .984c0 0 .762-.738 1.588-1.621h.943v1.637h-3.685v1.306h3.685v3.133l-.141-.004c-.407-.02-1.036-.089-1.286-.484-.298-.484-.077-1.359-.064-1.903h-2.544l-.093 .052c0 0-.935 4.205 2.689 4.112 3.387 .093 5.33-.955 6.265-1.677l.371 1.395 2.088-.883L17.9 13.562l-1.693 .536 .315 1.189c-.427 .331-.931 .573-1.467 .754v-2.737h3.592v-1.31h-3.592v-1.637h3.604v-1.306h-6.41c.464-.568 .822-1.089 .919-1.415L12.047 7.329c4.798-1.734 7.47-1.435 7.45 1.403v7.475c0 0 .282 2.564-2.637 2.383l-1.58-.343-.367 1.512c0 0 6.817 1.967 7.374-3.314 .552-5.281-.141-8.652-.141-8.652Z"),
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
        return _taobaoFill!!
    }

private var _taobaoFill: ImageVector? = null
