package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = phosphorBoldIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM212 196h-168v-136h168ZM60 92C60 83.163 67.163 76 76 76c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C67.163 108 60 100.837 60 92ZM108 92c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
