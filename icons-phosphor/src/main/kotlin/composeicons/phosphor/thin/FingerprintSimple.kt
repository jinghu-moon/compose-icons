package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FingerprintSimple: ImageVector
    get() {
        if (_fingerprintSimple != null) return _fingerprintSimple!!
        _fingerprintSimple = phosphorThinIcon(
            name = "FingerprintSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 128c.059 31.803-6.135 63.307-18.23 92.72-.913 1.907-3.152 2.774-5.111 1.98-1.959-.794-2.962-2.976-2.289-4.98C166.071 189.258 172.061 158.773 172 128c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM160.79 98.67c1.472 1.657 4.008 1.807 5.665 .335 1.657-1.472 1.807-4.008 .335-5.665C152.422 77.247 129.609 71.697 109.454 79.391 89.299 87.086 75.988 106.426 76 128c.01 23.716-6.005 47.045-17.48 67.8-1.071 1.933-.373 4.369 1.56 5.44 1.933 1.071 4.369 .373 5.44-1.56C77.647 177.736 84.005 153.072 84 128 84 109.758 95.256 93.408 112.296 86.898c17.04-6.511 36.331-1.832 48.494 11.762ZM128 28c-11.353-.011-22.624 1.913-33.33 5.69-1.394 .439-2.437 1.604-2.721 3.037-.284 1.433 .236 2.908 1.357 3.845 1.121 .938 2.663 1.19 4.024 .658 28.163-9.919 59.387-5.567 83.764 11.676C205.471 70.149 219.974 98.141 220 128c.02 21.235-2.328 42.406-7 63.12-.486 2.147 .855 4.284 3 4.78 .292 .068 .59 .101 .89 .1 1.866-.006 3.48-1.3 3.89-3.12C225.596 171.59 228.018 149.828 228 128 227.939 72.797 183.203 28.061 128 28ZM66.67 59.43c1.657-1.475 1.805-4.013 .33-5.67-1.475-1.657-4.013-1.805-5.67-.33C40.13 72.422 28.011 99.537 28 128c.03 13.23-2.816 26.309-8.34 38.33-.439 .968-.475 2.071-.1 3.065 .375 .994 1.131 1.799 2.1 2.235 .52 .243 1.086 .369 1.66 .37 1.565 .002 2.987-.908 3.64-2.33C32.96 156.6 36.044 142.381 36 128 36.022 101.825 47.173 76.894 66.67 59.43ZM112.25 204.37c-.969-.442-2.074-.48-3.071-.105-.997 .375-1.803 1.133-2.239 2.105-2 4.29-4.13 8.57-6.42 12.71-1.071 1.933-.373 4.369 1.56 5.44 1.933 1.071 4.369 .373 5.44-1.56 2.39-4.32 4.65-8.78 6.7-13.25 .454-.968 .501-2.078 .131-3.082-.37-1.003-1.127-1.817-2.101-2.258ZM128 124c-2.209 0-4 1.791-4 4 .009 15.853-1.98 31.644-5.92 47-.551 2.137 .734 4.316 2.87 4.87 .326 .087 .662 .13 1 .13 1.823-.001 3.414-1.235 3.87-3 4.111-16.009 6.188-32.472 6.18-49 0-2.209-1.791-4-4-4Z"),
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
        return _fingerprintSimple!!
    }

private var _fingerprintSimple: ImageVector? = null
