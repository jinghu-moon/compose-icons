package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorBoldIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 72.36C192.746 59.728 203.99 38.605 204 16 204 9.373 198.627 4 192 4h-8c-22.382 .015-43.324 11.043-56 29.49C115.324 15.043 94.382 4.015 72 4h-8C57.373 4 52 9.373 52 16c0 6.627 5.373 12 12 12h8c20.054 .026 37.563 13.589 42.6 33C70.155 67.524 36.911 105.175 35.94 150.085c-.971 44.91 30.617 83.962 74.738 92.4 44.121 8.438 87.889-16.203 103.559-58.302C229.906 142.085 212.901 94.823 174 72.36ZM178.22 28.36c-4.932 16.691-19.211 28.925-36.46 31.24 4.94-16.686 19.222-28.912 36.47-31.22ZM128 220C90.445 220 60 189.555 60 152 60 114.445 90.445 84 128 84c37.555 0 68 30.445 68 68-.039 37.539-30.461 67.961-68 68ZM177.62 167.6c-5.098 16.207-17.793 28.902-34 34-1.166 .362-2.379 .548-3.6 .55-5.928 .004-10.97-4.32-11.87-10.179-.899-5.859 2.614-11.497 8.27-13.271 8.735-2.744 15.576-9.585 18.32-18.32 1.988-6.324 8.726-9.838 15.05-7.85 6.324 1.988 9.838 8.726 7.85 15.05Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
