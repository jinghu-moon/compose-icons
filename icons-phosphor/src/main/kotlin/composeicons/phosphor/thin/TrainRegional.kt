package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorThinIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.86 119 197.47 36.84C196.045 31.619 191.302 27.998 185.89 28h-115.78c-5.412-.002-10.155 3.619-11.58 8.84L36.14 119c-.19 .687-.19 1.413 0 2.1l22.39 82.11c1.444 5.201 6.182 8.798 11.58 8.79h17.89L68.8 237.6c-1.325 1.767-.967 4.275 .8 5.6 1.767 1.325 4.275 .967 5.6-.8L98 212h60l22.8 30.4c1.325 1.767 3.833 2.125 5.6 .8 1.767-1.325 2.125-3.833 .8-5.6L168 212h17.89c5.412 .002 10.155-3.619 11.58-8.84l22.39-82.11c.181-.671 .181-1.379 0-2.05ZM66.25 39c.455-1.761 2.041-2.994 3.86-3h115.78c1.819 .006 3.405 1.239 3.86 3L211 116.84l-83 15.09L45 116.84ZM66.25 201.1 45.53 125.1 124 139.34v64.66h-53.89c-1.805 0-3.386-1.208-3.86-2.95ZM189.75 201.1c-.474 1.742-2.055 2.95-3.86 2.95h-53.89v-64.71l78.47-14.27ZM92 88c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
