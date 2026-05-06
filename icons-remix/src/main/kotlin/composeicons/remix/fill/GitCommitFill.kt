package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitCommitFill: ImageVector
    get() {
        if (_gitCommitFill != null) return _gitCommitFill!!
        _gitCommitFill = remixIcon(
            name = "GitCommitFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.874 13c-.444 1.725-2.01 3-3.874 3C10.136 16 8.57 14.725 8.126 13h-5.126v-2h5.126C8.57 9.275 10.136 8 12 8c1.864 0 3.43 1.275 3.874 3h5.126v2h-5.126Z"),
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
        return _gitCommitFill!!
    }

private var _gitCommitFill: ImageVector? = null
