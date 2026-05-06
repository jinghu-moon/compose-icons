package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brush2Line: ImageVector
    get() {
        if (_brush2Line != null) return _brush2Line!!
        _brush2Line = remixIcon(
            name = "Brush2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.536 15.946l2.121-2.121L15.475 10.643 19.011 7.108 16.889 4.986 13.354 8.522 10.172 5.34 8.05 7.461l8.485 8.485ZM15.122 17.361 6.636 8.875 3.808 11.704l8.485 8.485 2.828-2.828ZM13.354 5.693 16.182 2.865c.391-.391 1.024-.391 1.414 0l3.536 3.536c.39 .391 .39 1.024 0 1.414l-2.828 2.828 2.475 2.475c.391 .391 .391 1.024 0 1.414l-7.778 7.778c-.391 .391-1.024 .391-1.414 0L1.686 12.411c-.391-.391-.391-1.024 0-1.414L9.465 3.219c.391-.391 1.024-.391 1.414 0l2.475 2.475Z"),
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
        return _brush2Line!!
    }

private var _brush2Line: ImageVector? = null
