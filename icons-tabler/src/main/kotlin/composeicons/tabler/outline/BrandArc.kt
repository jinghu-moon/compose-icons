package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandArc: ImageVector
    get() {
        if (_brandArc != null) return _brandArc!!
        _brandArc = tablerOutlineIcon(
            name = "BrandArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.687 14.694l-.987 2.103c-.502 1.07-.125 2.387 .908 2.945 1.096 .59 2.444 .13 2.972-.995l.9-1.92")
            addPathData("M18.317 14.576c1.818-1.6 3.16-3.78 3.64-6.217C22.192 7.165 21.432 6.008 20.262 5.773c-.563-.114-1.149 .003-1.625 .326-.478 .323-.81 .826-.922 1.398-.208 1.054-.695 2.037-1.366 2.872")
            addPathData("M12.68 12.759c-.42 .104-.851 .156-1.283 .157-.336 0-.683-.04-1.03-.115C8.927 12.491 7.477 11.586 6.658 10.486c-.2-.261-.363-.548-.487-.853C5.961 9.096 5.545 8.666 5.015 8.438 4.486 8.21 3.887 8.204 3.353 8.42 2.246 8.875 1.712 10.156 2.157 11.28c.508 1.278 1.404 2.45 2.53 3.415 1.112 .952 2.4 1.677 3.791 2.133 .953 .31 1.942 .483 2.916 .483 1.076-.004 2.145-.186 3.162-.537")
            addPathData("M10.37 12.801l.943-2.013c.09-.19 .357-.19 .446 0l.923 1.97h.006-.006l1.88 4.015 .923 1.971c.353 .763 1.116 1.253 1.957 1.254q.29 0 .576-.081c1.303-.365 1.92-1.887 1.339-3.129L18.317 14.57 16.349 10.366l-.003 .003 .003-.003L13.487 4.254C13.135 3.492 12.373 3.003 11.533 3 10.7 3 9.94 3.488 9.58 4.254L6.66 10.486")
        }
        return _brandArc!!
    }

private var _brandArc: ImageVector? = null
