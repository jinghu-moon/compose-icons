package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorRegularIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 166.62741f, 214.62741f, 172.0f, 208.0f, 172.0f),
                    PathNode.CurveTo(201.37259f, 172.0f, 196.0f, 166.62741f, 196.0f, 160.0f),
                    PathNode.CurveTo(196.0f, 153.37259f, 201.37259f, 148.0f, 208.0f, 148.0f),
                    PathNode.CurveTo(214.62741f, 148.0f, 220.0f, 153.37259f, 220.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.45f, 199.29f),
                    PathNode.CurveTo(211.81946f, 222.69493f, 191.68483f, 239.96956f, 168.0f, 240.0f),
                    PathNode.LineTo(144.0f, 240.0f),
                    PathNode.CurveTo(117.501755f, 239.97244f, 96.02756f, 218.49825f, 96.0f, 192.0f),
                    PathNode.LineTo(96.0f, 151.49f),
                    PathNode.CurveTo(64.00304f, 147.45876f, 40.004047f, 120.24991f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 35.581722f, 43.581722f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(76.41828f, 32.0f, 80.0f, 35.581722f, 80.0f, 40.0f),
                    PathNode.CurveTo(80.0f, 44.418278f, 76.41828f, 48.0f, 72.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(55.99886f, 100.84206f, 61.143745f, 113.14905f, 70.284386f, 122.16942f),
                    PathNode.CurveTo(79.42503f, 131.18979f, 91.79908f, 136.17123f, 104.64f, 136.0f),
                    PathNode.CurveTo(130.75f, 135.66f, 152.0f, 113.75f, 152.0f, 87.17f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(131.58173f, 48.0f, 128.0f, 44.418278f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 35.581722f, 131.58173f, 32.0f, 136.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(164.41827f, 32.0f, 168.0f, 35.581722f, 168.0f, 40.0f),
                    PathNode.LineTo(168.0f, 87.17f),
                    PathNode.CurveTo(168.0f, 120.01f, 143.47f, 147.46f, 112.0f, 151.48f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 209.67311f, 126.32689f, 224.0f, 144.0f, 224.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(182.96628f, 223.97525f, 195.92426f, 213.5989f, 199.22f, 199.0f),
                    PathNode.CurveTo(179.20677f, 194.50456f, 165.83743f, 175.59917f, 168.26842f, 155.23183f),
                    PathNode.CurveTo(170.6994f, 134.86449f, 188.14278f, 119.63681f, 208.65184f, 119.978f),
                    PathNode.CurveTo(229.16089f, 120.31918f, 246.08812f, 136.11864f, 247.8403f, 156.55557f),
                    PathNode.CurveTo(249.59247f, 176.99251f, 235.60168f, 195.44273f, 215.45f, 199.27f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 160.0f),
                    PathNode.CurveTo(232.0f, 146.74516f, 221.25484f, 136.0f, 208.0f, 136.0f),
                    PathNode.CurveTo(194.74516f, 136.0f, 184.0f, 146.74516f, 184.0f, 160.0f),
                    PathNode.CurveTo(184.0f, 173.25484f, 194.74516f, 184.0f, 208.0f, 184.0f),
                    PathNode.CurveTo(221.25484f, 184.0f, 232.0f, 173.25484f, 232.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
