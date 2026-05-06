package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorBoldIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 88v88c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-88C188 63.699 168.301 44 144 44c-24.301 0-44 19.699-44 44v107l27.51-27.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-48 48c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-48-48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L76 195v-107C76 50.445 106.445 20 144 20c37.555 0 68 30.445 68 68Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
