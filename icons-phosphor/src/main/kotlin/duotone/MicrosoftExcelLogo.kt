package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorDuotoneIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 152.000 80.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 L 144.000 72.000 C 148.418 72.000 152.000 75.582 152.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 56.000 192.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 160.000 104.000 L 200.000 104.000 L 200.000 152.000 L 160.000 152.000 ZM 200.000 88.000 L 160.000 88.000 L 160.000 80.000 C 160.000 71.163 152.837 64.000 144.000 64.000 L 144.000 40.000 L 200.000 40.000 ZM 72.000 40.000 L 128.000 40.000 L 128.000 64.000 L 72.000 64.000 ZM 40.000 80.000 L 144.000 80.000 L 144.000 159.830 C 144.000 159.890 144.000 159.940 144.000 160.000 C 144.000 160.060 144.000 160.110 144.000 160.170 L 144.000 176.000 L 40.000 176.000 ZM 72.000 192.000 L 128.000 192.000 L 128.000 216.000 L 72.000 216.000 ZM 144.000 216.000 L 144.000 192.000 C 152.837 192.000 160.000 184.837 160.000 176.000 L 160.000 168.000 L 200.000 168.000 L 200.000 216.000 ZM 65.850 146.880 L 81.590 128.000 L 65.850 109.120 C 63.022 105.723 63.483 100.678 66.880 97.850 C 70.277 95.022 75.322 95.483 78.150 98.880 L 92.000 115.500 L 105.850 98.880 C 108.678 95.483 113.723 95.022 117.120 97.850 C 120.517 100.678 120.978 105.723 118.150 109.120 L 102.410 128.000 L 118.150 146.880 C 120.978 150.277 120.517 155.322 117.120 158.150 C 113.723 160.978 108.678 160.517 105.850 157.120 L 92.000 140.500 L 78.150 157.120 C 75.322 160.517 70.277 160.978 66.880 158.150 C 63.483 155.322 63.022 150.277 65.850 146.880 Z"),
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
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
