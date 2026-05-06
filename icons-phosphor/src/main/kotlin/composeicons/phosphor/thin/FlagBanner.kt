package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorThinIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.38 53.86C234.647 52.702 233.371 52 232 52h-192c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361L82.34 104 37.17 149.17c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469h140l-31.56 66.28c-.949 1.994-.103 4.38 1.89 5.33 .521 .252 1.091 .385 1.67 .39 1.542-.001 2.947-.888 3.61-2.28l80-168c.592-1.241 .505-2.698-.23-3.86ZM183.76 148h-134.1L90.83 106.83c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83L49.66 60h176Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
