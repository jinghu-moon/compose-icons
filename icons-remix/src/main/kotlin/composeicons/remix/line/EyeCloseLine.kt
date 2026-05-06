package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EyeCloseLine: ImageVector
    get() {
        if (_eyeCloseLine != null) return _eyeCloseLine!!
        _eyeCloseLine = remixIcon(
            name = "EyeCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.343 18.782 7.411 18.264l.787-2.939C7.009 14.887 5.917 14.25 4.961 13.453L2.808 15.607 1.394 14.193 3.547 12.039C2.356 10.61 1.52 8.875 1.176 6.968L3.144 6.61c.759 4.202 4.435 7.39 8.856 7.39 4.421 0 8.097-3.188 8.856-7.39l1.968 .358c-.344 1.906-1.18 3.642-2.371 5.071l2.153 2.153-1.414 1.414L19.039 13.453c-.956 .796-2.048 1.434-3.237 1.872l.787 2.939-1.932 .518-.788-2.94c-.608 .104-1.232 .158-1.87 .158-.637 0-1.262-.054-1.87-.158l-.788 2.94Z"),
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
        return _eyeCloseLine!!
    }

private var _eyeCloseLine: ImageVector? = null
