package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WordpressFill: ImageVector
    get() {
        if (_wordpressFill != null) return _wordpressFill!!
        _wordpressFill = remixIcon(
            name = "WordpressFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.323 12c0 3.439 2 6.4 4.892 7.808L4.077 8.469C3.58 9.58 3.323 10.783 3.323 12ZM12 20.677c1.008 0 1.977-.177 2.885-.492l-.061-.115L12.154 12.762 9.554 20.323c.769 .231 1.592 .354 2.446 .354ZM13.192 7.931l3.138 9.331 .869-2.892c.369-1.2 .654-2.061 .654-2.808 0-1.077-.385-1.815-.708-2.385-.446-.723-.854-1.331-.854-2.038 0-.8 .6-1.538 1.462-1.538h.108C16.263 4.132 14.17 3.319 12 3.323 10.563 3.323 9.148 3.68 7.883 4.362 6.619 5.044 5.543 6.03 4.754 7.231l.554 .015c.908 0 2.308-.115 2.308-.115 .477-.023 .531 .662 .062 .715 0 0-.469 .062-1 .085l3.169 9.4 1.9-5.692L10.392 7.931c-.303-.017-.606-.042-.908-.077-.469-.031-.415-.746 .054-.723 0 0 1.431 .115 2.285 .115 .908 0 2.308-.115 2.308-.115 .469-.023 .531 .662 .061 .715 0 0-.469 .054-1 .085ZM16.361 19.5c1.313-.763 2.402-1.858 3.159-3.174 .757-1.316 1.156-2.808 1.156-4.326 0-1.508-.385-2.923-1.062-4.162 .137 1.363-.069 2.738-.6 4l-2.654 7.661ZM12 22C9.348 22 6.804 20.946 4.929 19.071 3.054 17.196 2 14.652 2 12 2 9.348 3.054 6.804 4.929 4.929 6.804 3.054 9.348 2 12 2c2.652 0 5.196 1.054 7.071 2.929C20.946 6.804 22 9.348 22 12c0 2.652-1.054 5.196-2.929 7.071C17.196 20.946 14.652 22 12 22Z"),
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
        return _wordpressFill!!
    }

private var _wordpressFill: ImageVector? = null
