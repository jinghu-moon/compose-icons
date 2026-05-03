package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorBoldIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 212.0f),
                    PathNode.LineTo(89.45f, 212.0f),
                    PathNode.LineTo(199.63f, 121.26f),
                    PathNode.CurveTo(203.01619f, 118.55801f, 204.68317f, 114.24066f, 203.99146f, 109.96414f),
                    PathNode.CurveTo(203.29974f, 105.68762f, 200.35677f, 102.11592f, 196.29144f, 100.61917f),
                    PathNode.CurveTo(192.2261f, 99.12242f, 187.66968f, 99.933014f, 184.37f, 102.74f),
                    PathNode.LineTo(166.59f, 117.38f),
                    PathNode.CurveTo(161.17972f, 114.58199f, 155.479f, 112.385544f, 149.59f, 110.83f),
                    PathNode.CurveTo(169.43242f, 100.81392f, 179.80284f, 78.48517f, 174.65482f, 56.862465f),
                    PathNode.CurveTo(169.50679f, 35.23976f, 150.18709f, 19.97976f, 127.96f, 19.97976f),
                    PathNode.CurveTo(105.73291f, 19.97976f, 86.41321f, 35.23976f, 81.26518f, 56.862465f),
                    PathNode.CurveTo(76.117165f, 78.48517f, 86.48758f, 100.81392f, 106.33f, 110.83f),
                    PathNode.CurveTo(79.06436f, 118.08558f, 57.27134f, 138.55975f, 48.33f, 165.32f),
                    PathNode.CurveTo(46.225796f, 171.605f, 49.614998f, 178.40579f, 55.9f, 180.51f),
                    PathNode.CurveTo(62.185f, 182.61421f, 68.985794f, 179.225f, 71.09f, 172.94f),
                    PathNode.CurveTo(81.44883f, 142.08017f, 114.50942f, 125.09303f, 145.63f, 134.64f),
                    PathNode.LineTo(48.37f, 214.74f),
                    PathNode.CurveTo(44.462517f, 217.96065f, 42.9972f, 223.28748f, 44.707687f, 228.05351f),
                    PathNode.CurveTo(46.418175f, 232.81958f, 50.936302f, 235.99902f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(206.62741f, 236.0f, 212.0f, 230.62741f, 212.0f, 224.0f),
                    PathNode.CurveTo(212.0f, 217.37259f, 206.62741f, 212.0f, 200.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(141.25484f, 44.0f, 152.0f, 54.745167f, 152.0f, 68.0f),
                    PathNode.CurveTo(152.0f, 81.25484f, 141.25484f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(114.74516f, 92.0f, 104.0f, 81.25484f, 104.0f, 68.0f),
                    PathNode.CurveTo(104.0f, 54.745167f, 114.74516f, 44.0f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.61f, 157.51f),
                    PathNode.CurveTo(208.20692f, 165.48807f, 210.52855f, 173.98155f, 211.49f, 182.68f),
                    PathNode.CurveTo(212.21901f, 189.26875f, 207.46875f, 195.20099f, 200.88f, 195.93f),
                    PathNode.CurveTo(194.29124f, 196.65901f, 188.35901f, 191.90875f, 187.63f, 185.32f),
                    PathNode.CurveTo(186.9537f, 179.11566f, 185.29993f, 173.05742f, 182.73f, 167.37f),
                    PathNode.CurveTo(180.07808f, 161.34196f, 182.77977f, 154.30301f, 188.78386f, 151.59732f),
                    PathNode.CurveTo(194.78795f, 148.89165f, 201.85077f, 151.53033f, 204.61f, 157.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
