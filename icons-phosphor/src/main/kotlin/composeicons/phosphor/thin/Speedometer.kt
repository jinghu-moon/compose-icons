package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorThinIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M117.17 157.17l96-96c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66l-96 96c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66ZM128 84c7.384-.008 14.72 1.187 21.72 3.54 1.389 .631 3.015 .418 4.194-.55 1.179-.968 1.704-2.522 1.355-4.007-.349-1.485-1.513-2.642-2.999-2.983C129.081 72.186 103.548 76.015 83.672 90.287 63.795 104.56 52.007 127.53 52 152c.003 2.82 .157 5.637 .46 8.44 .225 2.036 1.952 3.572 4 3.56h.45c1.056-.116 2.023-.647 2.687-1.476 .664-.829 .971-1.888 .853-2.944-2.157-19.229 3.98-38.467 16.875-52.894C90.22 92.258 108.65 84.007 128 84ZM224.17 102.82c-.601-1.355-1.902-2.266-3.381-2.369-1.479-.102-2.893 .622-3.674 1.881-.782 1.259-.803 2.848-.055 4.128 12.462 24.455 14.363 52.947 5.26 78.84-.556 1.618-2.079 2.703-3.79 2.7h-181.07c-1.718-.02-3.239-1.116-3.8-2.74C20.072 146.656 31.366 103.668 62.174 76.727 92.982 49.787 137.092 44.326 173.54 62.94c1.277 .701 2.835 .653 4.066-.127 1.231-.78 1.94-2.168 1.852-3.622-.089-1.455-.961-2.746-2.278-3.371C162.268 48.16 145.764 44.111 129 44h-1C92.96 44.018 60.104 61.026 39.858 89.625 19.613 118.225 14.492 154.866 26.12 187.92c1.689 4.822 6.231 8.058 11.34 8.08h181.07c5.095 .011 9.642-3.196 11.34-8 9.83-27.964 7.77-58.736-5.7-85.14Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
