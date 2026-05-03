package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorBoldIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 96.000 L 96.000 96.000 C 67.281 96.000 44.000 119.281 44.000 148.000 C 44.000 176.719 67.281 200.000 96.000 200.000 L 160.000 200.000 C 188.719 200.000 212.000 176.719 212.000 148.000 C 212.000 119.281 188.719 96.000 160.000 96.000 ZM 160.000 176.000 L 96.000 176.000 C 80.536 176.000 68.000 163.464 68.000 148.000 C 68.000 132.536 80.536 120.000 96.000 120.000 L 160.000 120.000 C 175.464 120.000 188.000 132.536 188.000 148.000 C 188.000 163.464 175.464 176.000 160.000 176.000 ZM 112.000 148.000 C 112.000 156.837 104.837 164.000 96.000 164.000 C 87.163 164.000 80.000 156.837 80.000 148.000 C 80.000 139.163 87.163 132.000 96.000 132.000 C 104.837 132.000 112.000 139.163 112.000 148.000 ZM 176.000 148.000 C 176.000 156.837 168.837 164.000 160.000 164.000 C 151.163 164.000 144.000 156.837 144.000 148.000 C 144.000 139.163 151.163 132.000 160.000 132.000 C 168.837 132.000 176.000 139.163 176.000 148.000 ZM 212.000 36.000 C 196.744 36.000 183.145 45.617 178.060 60.000 L 77.940 60.000 C 72.094 43.471 55.192 33.557 37.912 36.522 C 20.633 39.486 8.002 54.468 8.000 72.000 L 8.000 148.000 C 8.055 196.578 47.422 235.945 96.000 236.000 L 160.000 236.000 C 208.578 235.945 247.945 196.578 248.000 148.000 L 248.000 72.000 C 248.000 52.118 231.882 36.000 212.000 36.000 ZM 224.000 148.000 C 223.961 183.330 195.330 211.961 160.000 212.000 L 96.000 212.000 C 60.670 211.961 32.039 183.330 32.000 148.000 L 32.000 72.000 C 32.000 65.373 37.373 60.000 44.000 60.000 C 50.627 60.000 56.000 65.373 56.000 72.000 C 56.000 78.627 61.373 84.000 68.000 84.000 L 188.000 84.000 C 194.627 84.000 200.000 78.627 200.000 72.000 C 200.000 65.373 205.373 60.000 212.000 60.000 C 218.627 60.000 224.000 65.373 224.000 72.000 Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
