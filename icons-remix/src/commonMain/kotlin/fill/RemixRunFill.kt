package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RemixRunFill: ImageVector
    get() {
        if (_remixRunFill != null) return _remixRunFill!!
        _remixRunFill = remixIcon(
            name = "RemixRunFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.115 20.000 C 19.115 18.936 19.115 17.961 18.954 15.881 C 18.753 13.792 17.665 12.733 15.805 12.361 C 18.009 12.075 19.641 10.357 19.641 7.724 C 19.641 4.204 17.322 2.000 12.656 2.000 L 4.000 2.000 L 4.000 5.669 L 11.797 5.669 C 13.858 5.669 14.889 6.553 14.889 8.013 C 14.889 9.673 13.858 10.300 11.797 10.300 L 4.000 10.300 L 4.000 14.050 L 11.568 14.050 C 13.200 14.050 14.087 14.507 14.230 16.568 C 14.339 17.976 14.325 18.673 14.312 19.341 L 14.312 19.344 C 14.308 19.558 14.304 19.769 14.304 20.000 L 19.115 20.000 ZM 4.000 17.205 L 4.000 20.000 L 10.122 20.000 L 10.122 18.211 C 10.122 17.835 9.938 17.205 9.088 17.205 L 4.000 17.205 Z"),
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
        return _remixRunFill!!
    }

private var _remixRunFill: ImageVector? = null
