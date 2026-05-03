package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SteeringLine: ImageVector
    get() {
        if (_steeringLine != null) return _steeringLine!!
        _steeringLine = remixIcon(
            name = "SteeringLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.799 14.001 C 20.963 18.117 17.600 21.315 13.399 21.903 L 13.399 19.878 C 16.493 19.332 18.973 17.009 19.747 14.000 L 21.799 14.001 ZM 4.252 14.000 C 5.018 16.976 7.452 19.281 10.499 19.860 L 10.499 21.888 C 6.346 21.263 3.029 18.084 2.200 14.001 L 4.252 14.000 ZM 17.999 11.000 L 17.999 13.000 L 14.999 13.000 C 13.945 13.000 13.081 13.816 13.005 14.851 L 12.999 15.000 L 12.999 18.000 L 10.999 18.000 L 10.999 15.000 C 10.999 13.946 10.184 13.082 9.149 13.005 L 8.999 13.000 L 5.999 13.000 L 5.999 11.000 L 17.999 11.000 ZM 11.999 2.000 C 17.185 2.000 21.448 5.947 21.950 11.000 L 19.938 11.000 C 19.445 7.054 16.079 4.000 11.999 4.000 C 7.920 4.000 4.553 7.054 4.061 11.000 L 2.049 11.000 C 2.551 5.947 6.814 2.000 11.999 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _steeringLine!!
    }

private var _steeringLine: ImageVector? = null
