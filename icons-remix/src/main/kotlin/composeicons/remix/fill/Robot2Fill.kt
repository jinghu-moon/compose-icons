package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Robot2Fill: ImageVector
    get() {
        if (_robot2Fill != null) return _robot2Fill!!
        _robot2Fill = remixIcon(
            name = "Robot2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 2c0 .444-.193 .843-.5 1.118v1.882h5c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-10C3 6.343 4.343 5 6 5h5v-1.882C10.693 2.843 10.5 2.444 10.5 2 10.5 1.172 11.172 .5 12 .5c.828 0 1.5 .672 1.5 1.5ZM0 10h2v6h-2v-6ZM24 10h-2v6h2v-6ZM9 14.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM16.5 13c0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5 .828 0 1.5-.672 1.5-1.5Z"),
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
        return _robot2Fill!!
    }

private var _robot2Fill: ImageVector? = null
