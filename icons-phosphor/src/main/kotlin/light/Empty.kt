package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorLightIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(195.51f, 62.66f),
                    PathNode.LineTo(212.44f, 44.0f),
                    PathNode.CurveTo(214.10504f, 42.454533f, 214.75446f, 40.101227f, 214.11766f, 37.92055f),
                    PathNode.CurveTo(213.48088f, 35.739876f, 211.66711f, 34.105858f, 209.43204f, 33.699272f),
                    PathNode.CurveTo(207.19698f, 33.292686f, 204.92395f, 34.18328f, 203.56f, 36.0f),
                    PathNode.LineTo(186.63f, 54.58f),
                    PathNode.CurveTo(147.86807f, 24.078676f, 92.123276f, 28.724785f, 58.94541f, 65.22201f),
                    PathNode.CurveTo(25.767555f, 101.71922f, 26.441895f, 157.65326f, 60.49f, 193.34f),
                    PathNode.LineTo(43.56f, 212.0f),
                    PathNode.CurveTo(41.69497f, 214.48413f, 42.03432f, 217.98099f, 44.342197f, 220.06017f),
                    PathNode.CurveTo(46.65007f, 222.13933f, 50.163273f, 222.11322f, 52.44f, 220.0f),
                    PathNode.LineTo(69.37f, 201.38f),
                    PathNode.CurveTo(108.13188f, 231.75351f, 163.76479f, 227.06363f, 196.89478f, 190.6296f),
                    PathNode.CurveTo(230.02473f, 154.19556f, 229.42062f, 98.36859f, 195.51f, 62.66f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 128.0f),
                    PathNode.CurveTo(45.97215f, 96.62642f, 63.86302f, 67.99186f, 92.07224f, 54.2608f),
                    PathNode.CurveTo(120.28147f, 40.529743f, 153.85493f, 44.113644f, 178.53f, 63.49f),
                    PathNode.LineTo(68.59f, 184.43f),
                    PathNode.CurveTo(54.081757f, 169.226f, 45.99111f, 149.01549f, 46.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 210.0f),
                    PathNode.CurveTo(109.66996f, 210.01303f, 91.86977f, 203.85184f, 77.47f, 192.51f),
                    PathNode.LineTo(187.41f, 71.57f),
                    PathNode.CurveTo(210.01094f, 95.31727f, 216.28235f, 130.2499f, 203.3532f, 160.37584f),
                    PathNode.CurveTo(190.42406f, 190.50179f, 160.78316f, 210.02191f, 128.0f, 210.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _empty!!
    }

private var _empty: ImageVector? = null
