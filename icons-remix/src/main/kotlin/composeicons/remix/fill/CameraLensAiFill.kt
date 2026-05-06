package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraLensAiFill: ImageVector
    get() {
        if (_cameraLensAiFill != null) return _cameraLensAiFill!!
        _cameraLensAiFill = remixIcon(
            name = "CameraLensAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM14.309 14 9.827 21.763c.7 .155 1.427 .237 2.173 .237 2.181 0 4.198-.698 5.841-1.882L14.309 14ZM2.458 15c.857 2.73 2.854 4.955 5.432 6.119L11.423 15h-8.965ZM2 12c0 .337 .017 .671 .049 1h7.064L4.632 5.239C2.998 7.019 2 9.393 2 12ZM12 2C9.819 2 7.802 2.698 6.159 3.883L9.691 10 14.173 2.237C13.473 2.082 12.746 2 12 2ZM22 12c0-.337-.017-.671-.049-1h-7.064l4.481 7.761C21.002 16.981 22 14.607 22 12Z"),
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
        return _cameraLensAiFill!!
    }

private var _cameraLensAiFill: ImageVector? = null
