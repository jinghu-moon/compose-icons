package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fingerprint: ImageVector
    get() {
        if (_fingerprint != null) return _fingerprint!!
        _fingerprint = phosphorDuotoneIcon(
            name = "Fingerprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M72 128c.057 20.985-4.792 41.692-14.16 60.47-1.218 2.651-3.781 4.429-6.691 4.64-2.909 .211-5.703-1.178-7.291-3.625-1.588-2.447-1.717-5.564-.339-8.135C51.78 164.782 56.054 146.513 56 128 55.962 106.13 65.903 85.438 83 71.8c3.449-2.761 8.484-2.204 11.245 1.245 2.761 3.449 2.204 8.484-1.245 11.245C79.699 94.894 71.966 110.99 72 128ZM128 120c-4.418 0-8 3.582-8 8-.002 31.168-7.915 61.825-23 89.1-2.143 3.866-.746 8.737 3.12 10.88 3.866 2.143 8.737 .746 10.88-3.12C127.396 195.209 135.998 161.882 136 128c0-4.418-3.582-8-8-8ZM128 88c-22.091 0-40 17.909-40 40 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 .083 31.81-6.924 63.238-20.51 92-1.886 4.007-.167 8.784 3.84 10.67 4.007 1.886 8.784 .167 10.67-3.84C160.583 195.93 168.099 162.169 168 128 168 105.909 150.091 88 128 88ZM128 24C70.588 24.061 24.061 70.588 24 128c.015 9.99-1.676 19.909-5 29.33-1.472 4.167 .713 8.738 4.88 10.21 4.167 1.472 8.738-.713 10.21-4.88C38.015 151.526 40.013 139.805 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88 .004 18.278-1.768 36.514-5.29 54.45-.412 2.082 .021 4.242 1.203 6.005 1.182 1.763 3.015 2.984 5.097 3.395 .511 .099 1.03 .149 1.55 .15 3.818-.004 7.1-2.705 7.84-6.45C230.125 166.593 232.001 147.319 232 128 231.934 70.59 185.41 24.066 128 24ZM94.4 152.17c-4.32-.859-8.521 1.934-9.4 6.25-3.246 15.976-9.058 31.322-17.21 45.44-2.209 3.827-.897 8.721 2.93 10.93 3.827 2.209 8.721 .897 10.93-2.93 9.009-15.612 15.426-32.583 19-50.25 .425-2.081 .004-4.245-1.168-6.016-1.172-1.771-3.001-3.003-5.082-3.424ZM128 56c-3.009 .001-6.014 .188-9 .56-4.296 .645-7.293 4.601-6.75 8.912 .543 4.31 4.427 7.4 8.75 6.958 15.942-1.982 31.969 2.967 44.017 13.594C177.065 96.651 183.977 111.935 184 128c-.002 10.363-.644 20.716-1.92 31-.283 2.112 .288 4.251 1.587 5.94 1.299 1.69 3.219 2.791 5.333 3.06 .332 .04 .666 .06 1 .06 4.025-.009 7.417-3.007 7.92-7 1.349-10.948 2.017-21.969 2-33C199.909 88.322 167.738 56.088 128 56ZM185.93 184.25c-2.055-.532-4.238-.224-6.067 .854-1.829 1.079-3.154 2.84-3.683 4.896-1.46 5.69-3.15 11.4-5 17-1.409 4.178 .827 8.708 5 10.13 .821 .279 1.683 .421 2.55 .42 3.437-.003 6.489-2.201 7.58-5.46 2-5.92 3.79-12 5.35-18.05 .542-2.056 .243-4.242-.83-6.077-1.073-1.835-2.833-3.167-4.89-3.703Z"),
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
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
