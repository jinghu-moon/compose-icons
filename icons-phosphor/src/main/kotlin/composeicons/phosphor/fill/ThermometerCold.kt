package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorFillIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.91 77.72l-20 6.49 12.34 17c1.775 2.307 2.158 5.396 .998 8.066-1.16 2.67-3.678 4.499-6.576 4.777-2.898 .277-5.717-1.041-7.362-3.443L216 93.61l-12.34 17c-2.642 3.433-7.537 4.139-11.042 1.593-3.505-2.546-4.346-7.419-1.898-10.993l12.34-17-20-6.49c-4.203-1.364-6.504-5.877-5.14-10.08 1.364-4.203 5.877-6.504 10.08-5.14L208 69v-21c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v21l20-6.49c4.203-1.367 8.718 .932 10.085 5.135 1.367 4.203-.932 8.718-5.135 10.085ZM176 192c-.021 26.576-18.718 49.477-44.752 54.815-26.034 5.338-52.235-8.358-62.712-32.781C58.058 189.61 66.19 161.186 88 146v-106C88 22.327 102.327 8 120 8c17.673 0 32 14.327 32 32v106c15.019 10.506 23.975 27.672 24 46ZM80.82 184h78.36C156.876 172.79 149.899 163.095 140 157.35c-2.476-1.429-4.001-4.071-4-6.93v-110.42c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v110.42c.001 2.859-1.524 5.501-4 6.93C90.101 163.095 83.124 172.79 80.82 184Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
